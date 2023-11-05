package homeworks.medicalcenter.util;

import homeworks.medicalcenter.storage.PersonStorage;

import java.io.*;

public abstract class StorageSerializeUtil {

    private static final String PERSON_FILE_UTIL = "C:\\Users\\Yura\\IdeaProjects\\JavaCore\\src\\homeworks\\medicalcenter\\data\\personStorage.dat";

    public static void serializePersonStorage(PersonStorage personStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PERSON_FILE_UTIL))) {
            outputStream.writeObject(personStorage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PersonStorage deserializePersonStorage() {
        File file = new File(PERSON_FILE_UTIL);

        if (!file.exists()) {
            return new PersonStorage();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PERSON_FILE_UTIL))) {
            Object o = inputStream.readObject();
            if (o instanceof PersonStorage personStorage) {
                return personStorage;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new PersonStorage();
    }
}
