package main.java.com.fsm.validator;

import com.fsm.validator.models.FileInfo;

import java.util.List;

public class SerialGenerator {
    public int highest(List<FileInfo> files) {
        return files.stream()
                .filter(f -> f.getSerial() != null)
                .mapToInt(FileInfo::getSerial)
                .max()
                .orElse(0);
    }
}
