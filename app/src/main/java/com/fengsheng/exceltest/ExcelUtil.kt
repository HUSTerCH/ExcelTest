package com.fengsheng.exceltest

import android.util.Log
import jxl.Workbook
import jxl.WorkbookSettings
import jxl.format.Alignment
import jxl.format.Border
import jxl.format.BorderLineStyle
import jxl.format.Colour
import jxl.write.*
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import java.util.*

/**
 * @author Nicole
 * @since 2020.10.22
 */

object ExcelUtil {
    private var arial14font: WritableFont? = null
    private var arial14format: WritableCellFormat? = null
    private var arial10font: WritableFont? = null
    private var arial10format: WritableCellFormat? = null
    private var arial12font: WritableFont? = null
    private var arial12format: WritableCellFormat? = null
    private const val UTF8_ENCODING = "UTF-8"

    /**
     * 单元格的格式设置 字体大小 颜色 对齐方式、背景颜色等...
     */
    private fun format() {
        try {
            arial14font = WritableFont(WritableFont.ARIAL, 14, WritableFont.BOLD)
            arial14font!!.colour = Colour.LIGHT_BLUE
            arial14format = WritableCellFormat(arial14font)
            arial14format!!.alignment = Alignment.CENTRE
            arial14format!!.setBorder(
                Border.ALL,
                BorderLineStyle.THIN
            )
            arial14format!!.setBackground(Colour.VERY_LIGHT_YELLOW)
            arial10font = WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD)
            arial10format = WritableCellFormat(arial10font)
            arial10format!!.alignment = Alignment.CENTRE
            arial10format!!.setBorder(
                Border.ALL,
                BorderLineStyle.THIN
            )
            arial10format!!.setBackground(Colour.GRAY_25)
            arial12font = WritableFont(WritableFont.ARIAL, 10)
            arial12format = WritableCellFormat(arial12font)
            //对齐格式
            arial10format!!.alignment = Alignment.CENTRE
            //设置边框
            arial12format!!.setBorder(
                Border.ALL,
                BorderLineStyle.THIN
            )
        } catch (e: WriteException) {
            e.printStackTrace()
        }
    }

    /**
     * 初始化Excel表格
     *
     * @param filePath  存放excel文件的路径（path/demo.xls）
     * @param sheetName Excel表格的表名
     * @param sheetNum excel表格页数（可以有多页）
     * @param colName   excel中包含的列名（可以有多个）
     */
    fun initExcel(
        filePath: String,
        sheetName: String,
        sheetNum: Int,
        colName: Array<String>
    ) {
        format()
        var workbook: WritableWorkbook? = null
        try {
            val file = File(filePath)
            if (!file.exists()) {
                Log.d("ExcelUtil", "文件创建：${file.exists()}")
                file.createNewFile()
                Log.d("ExcelUtil", "文件创建：${file.exists()}")
            } else {
                return
            }
            workbook = Workbook.createWorkbook(file)
            //设置表格页数多页
            for (i in 1.rangeTo(sheetNum)) {
                val sheet = workbook.createSheet("$sheetName $i", i)
                //创建标题栏
                sheet.addCell(Label(0, 0, filePath, arial14format) as WritableCell)
                for (col in colName.indices) {
                    sheet.addCell(Label(col, 0, colName[col], arial10format))
                }
                //设置行高
                sheet.setRowView(0, 340)
            }
            workbook.write()
            Log.d("ExcelUtil", "initsuccess")
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            if (workbook != null) {
                try {
                    workbook.close()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }

    /**
     * 将制定类型的List写入Excel中
     *
     * @param objList  待写入的list
     * @param fileName
     * @param sheetNum 第几页
     * @param <T>
    </T> */
    fun <T> writeObjListToExcel(
        objList: List<T>,
        fileName: String,
        sheetNum: Int
    ) {
        if (objList != null && objList.size > 0) {
            Log.d("ExcelUtil", "write begin")
            var writeBook: WritableWorkbook? = null
            var inputStream: InputStream? = null
            try {
                val setEncode = WorkbookSettings()
                setEncode.encoding = UTF8_ENCODING
                inputStream = FileInputStream(File(fileName))
                val workbook = Workbook.getWorkbook(inputStream)
                writeBook = Workbook.createWorkbook(File(fileName), workbook)
                val sheet = writeBook.getSheet(sheetNum-1)
                for (j in 0..objList.size) {
                    val demoBean: DeviceDataBean = objList[j] as DeviceDataBean
                    val list: MutableList<String> = ArrayList()
                    list.add(demoBean.id.toString())
                    list.add(demoBean.situation)
                    list.add(demoBean.date)
                    list.add(demoBean.deviceNum.toString())
                    list.add(demoBean.identity.toString())
                    list.add(demoBean.power.toString())
                    list.add(demoBean.temperature.toString())
                    list.add(demoBean.distance.toString())
                    list.add(demoBean.voltageLevel.toString())
                    for (i in 0..list.size) {
                        sheet.addCell(
                            Label(
                                i,
                                j + 1,
                                list[i],
                                arial12format
                            )
                        )
                        if (list[i].length <= 4) {
                            //设置列宽
                            sheet.setColumnView(i, list[i].length + 8)
                        } else {
                            //设置列宽
                            sheet.setColumnView(i, list[i].length + 5)
                        }
                        //设置行高
                        sheet.setRowView(j + 1, 350)
                    }
                }
                writeBook.write()
                workbook.close()
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                if (writeBook != null) {
                    try {
                        writeBook.close()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close()
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }
        }
    }
}

