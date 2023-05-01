package HW3.base.abstractClasses;

import HW3.base.classes.workWithFile.CFileCreator;
import HW3.base.classes.workWithFile.CFindTheSameFileName;
import HW3.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}