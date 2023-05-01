package HW3;

import HW3.base.classes.Presenter;
import HW3.base.classes.checkInputData.*;
import HW3.base.classes.parseData.CDataParseProcessor;
import HW3.base.classes.ui.CGetData;
import HW3.base.classes.workWithFile.CFileCreator;
import HW3.base.classes.workWithFile.CFileWriter;
import HW3.base.classes.workWithFile.CFindTheSameFileName;


import java.io.IOException;

public class program {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src/HW3/data/";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}