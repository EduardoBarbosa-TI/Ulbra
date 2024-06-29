class Conversion {
    constructor(file){
        this.file = file;
    }

    convert(){
        return this.file;
    }
}

class ConvertXMLFile extends Conversion {
    convert(){
        const file = super.convert();
        console.log(`File ${file} will be converted`);
        return file;
    }
}

class ConvertXMLtoCSV {
    constructor(file){
        this.file = file
    }

    convert(){
        const file = this.file.convert()
        const convertedFileToCsv = file.split('.')[0] + ".csv";
        console.log(`Converted ${convertedFileToCsv} file`);
        return convertedFileToCsv;
    }
}

class ConvertXMLtoXLSX {
    constructor(file){
        this.file = file;
    }

    convert(){
        const file = this.file.convert()
        const convertedFileToXlsx = file.split('.')[0] + ".xlsx";
        console.log(`Converted file to ${convertedFileToXlsx}`);
        return convertedFileToXlsx; 
    }
}

let fileConversion = new ConvertXMLFile("file.xml");

fileConversion = new ConvertXMLtoCSV(fileConversion);
fileConversion.convert();

fileConversion = new ConvertXMLtoXLSX(fileConversion);
fileConversion.convert();

