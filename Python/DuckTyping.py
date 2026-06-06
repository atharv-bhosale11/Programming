#Duck Typing : It is a concept where the type of an object is determined by 
#it's behaviour but not by it's class.

class InkjetPrinter:
    def printdocument(self,document):
        print("InkJet Printer printing: ",document)     

class LaserPrinter:
    def printdocument(self,document):
        print("Laser Printer printing: ",document)

class PDFWriter:
    def printdocument(self,document):
        print(f" Saving {document} as pdf")

def StartPrinting(Device):
    Device.printdocument("Marvellous Notes")

def main():
    StartPrinting(InkjetPrinter())
    StartPrinting(LaserPrinter())
    StartPrinting(PDFWriter())
    
main()