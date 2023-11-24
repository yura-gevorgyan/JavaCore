package homeworks.fileanalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {

    // Читаем файл, составляем мапу слово-количество и возвращаем ее
    public Map<String, Integer> wordMap(String path) {
        File file = new File(path);
        Map<String, Integer> wordMap = new HashMap<>();

        if (file.isFile() && file.getName().endsWith(".txt")) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] word = line.split(" ");
                    for (String s : word) {
                        s = s.replaceAll(",", "");
                        s = s.replaceAll("!", "");
                        s = s.replaceAll(":", "");
                        s = s.replaceAll("\\.", "");
                        if (wordMap.get(s) == null) {
                            wordMap.put(s, 1);
                        } else {
                            Integer iOb = wordMap.get(s);
                            wordMap.put(s, ++iOb);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Your input file is not .txt file");
        }
        return wordMap;
    }

    // Читаем файл, подсчитываем общее количество слов
    public int totalWordCount(String path) {
        File file = new File(path);
        int count = 0;

        if (file.isFile() && file.getName().endsWith(".txt")) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] word = line.split(" ");
                    for (int i = 0; i < word.length; i++) {
                        count++;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Your input file is not .txt file");
        }
        return count;
    }

    // Читаем файл, подсчитываем количество уникальных слов
    public int uniqueWordCount(String path) {

//        Map<String, Integer> wordMap = wordMap(path);
//        Set<String> words = new HashSet<>();
//
//        for (Map.Entry<String, Integer> stringIntegerEntry : wordMap.entrySet()) {
//            words.add(stringIntegerEntry.getKey());
//        }
//
//        return words.size();


        Set<String> words = new HashSet<>();
        File file = new File(path);

        if (file.isFile() && file.getName().endsWith(".txt")) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] word = line.split(" ");
                    for (String s : word) {
                        s = s.replaceAll(",", "");
                        s = s.replaceAll("!", "");
                        s = s.replaceAll(":", "");
                        s = s.replaceAll("\\.", "");
                        words.add(s);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Your input file is not .txt file");
        }
        return words.size();

    }

    public Map<String, Integer> topFrequentWords(String path, int n) {

        File file = new File(path);
        Map<String, Integer> wordMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        if (file.isFile() && file.getName().endsWith(".txt")) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split(" ");
                    for (String s : words) {
                        s = s.replaceAll(",", "");
                        s = s.replaceAll("!", "");
                        s = s.replaceAll(":", "");
                        s = s.replaceAll("\\.", "");
                        if (wordMap.get(s) == null) {
                            wordMap.put(s, 1);
                        } else {
                            Integer iOb = wordMap.get(s);
                            wordMap.put(s, ++iOb);
                        }
                    }
                }
                if (n <= wordMap.size()) {

                    List<Map.Entry<String, Integer>> topFrequentWords = new ArrayList<>(wordMap.entrySet());
                    topFrequentWords.sort(new Comparator<Map.Entry<String, Integer>>() {
                        @Override
                        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                            return o2.getValue().compareTo(o1.getValue());
                        }
                    });

                    for (Map.Entry<String, Integer> topFrequentWord : topFrequentWords) {
                        linkedHashMap.put(topFrequentWord.getKey(), topFrequentWord.getValue());
                    }

                } else {
                    System.out.println("       ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Your input file is not .txt file");
        }

        return linkedHashMap;
    }


    // Читаем файл, находим количество вхождений слова и возвращаем это число
    public int countWordOccurrences(String path, String word) {

        File file = new File(path);
        Map<String, Integer> wordMap = new HashMap<>();

        if (file.isFile() && file.getName().endsWith(".txt")) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split(" ");
                    for (String s : words) {
                        s = s.replaceAll(",", "");
                        s = s.replaceAll("!", "");
                        s = s.replaceAll(":", "");
                        s = s.replaceAll("\\.", "");
                        if (wordMap.get(s) == null) {
                            wordMap.put(s, 1);
                        } else {
                            Integer iOb = wordMap.get(s);
                            wordMap.put(s, ++iOb);
                        }
                    }
                }
                return wordMap.get(word);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Your input file is not .txt file");
        }
        return 0;
    }

}

