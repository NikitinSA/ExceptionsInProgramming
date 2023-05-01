package HW3.base.interfaces;

import HW3.base.exceptions.GetDataException;

import java.io.IOException;

public interface IGetData {
    public String getData() throws IOException;
}