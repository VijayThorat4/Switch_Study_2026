const ExcelJs = require('exceljs');

async function excelRead() 
{
  const workbook = new ExcelJs.Workbook();
  await workbook.xlsx.readFile("C:/Users/VJ/Desktop/PlayWright_Shetty/EXCEL_JS_UTIL/test_data.xlsx");
  const worksheet = workbook.getWorksheet('Sheet1');
 
  worksheet.eachRow((row, rowNumber) => 
{
    row.eachCell((cell, colNumber) => 
    {
        console.log(cell.value);
      })
    })
}

excelRead();