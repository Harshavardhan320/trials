package com.fsm.validator;

import com.fsm.validator.models.FileInfo;

import java.io.File;

public class FileRenamer {
    public static void rename(FileInfo f) {

        // repo root
        String root = System.getProperty("user.dir");

        // folder path: daily, weekly…
        String folder = f.getFolder().toLowerCase();

        File oldFile = new File(root + "/" + folder + "/" + f.getOriginalName());
        File newFile = new File(root + "/" + folder + "/" + f.getFinalName());

        if (!oldFile.exists()) {
            System.out.println("❌ File not found for rename: " + oldFile.getPath());
            return;
        }

        boolean ok = oldFile.renameTo(newFile);

        if (ok) {
            System.out.println("✅ Renamed: " + oldFile.getPath() + " → " + newFile.getPath());
        } else {
            System.out.println("❌ Rename failed: " + oldFile.getPath());
        }
    }
}
