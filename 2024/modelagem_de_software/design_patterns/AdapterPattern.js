class ExtractXLSXFile {
    transformXLSX(fileXLSX){
        console.log(`Extract ${fileXLSX} file.`);
    }
}

class ExtractCSVFile {
    transformCSV(fileCSV){
        console.log(`Extract ${fileCSV} file.`);
    }
}

class ExtractXMLFile {
    transformXML(fileXML){
        console.log(`Extract ${fileXML} file.`);
    }
}

class ExtractFileAdapter{
    constructor(file){
        this.file = file
    }

    extract(file){
        if(this.file.transformXLSX) {
            this.file.transformXLSX(file);
        } else if(this.file.transformCSV){
            this.file.transformCSV(file);
        } else if(this.file.transformXML){
            this.file.transformXML(file)
        } else {
            throw new Error('Unsupported file format.');
        }
    }
}

const fileXLSX = new ExtractXLSXFile();
const fileCSV = new ExtractCSVFile();
const fileXML = new ExtractXMLFile();

const extractFileAdapter01 = new ExtractFileAdapter(fileXLSX);
extractFileAdapter01.extract("File.xlsx")
const extractFileAdapter02 = new ExtractFileAdapter(fileCSV);
extractFileAdapter02.extract("File.csv")
const extractFileAdapter03 = new ExtractFileAdapter(fileXML);
extractFileAdapter03.extract("File.xml")