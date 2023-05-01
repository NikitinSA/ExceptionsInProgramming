package HW3.base.interfaces;

import HW3.base.exceptions.MyFileCreateException;
import HW3.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}