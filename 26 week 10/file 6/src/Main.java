//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    String filePath = ".\\data\\sample.txt";
    String outputPath = ".\\data\\sample_copy.txt";
    int count = 0;
    int lineCount = 0;

    File file = new File(filePath);
    if (file.exists()){
        System.out.printf("%s File이 존재 합니다\n", filePath);
        try {
            FileReader fileReader = new FileReader(file, Charset.defaultCharset());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(outputPath, Charset.defaultCharset());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                lineCount++;
                count += line.length() + 1;
            }
            System.out.printf("%,d Bytes 복사 (%,d Lines)\n", count, lineCount);
            bufferedReader.close();
            bufferedWriter.close();
            Runtime.getRuntime().exec("notepad.exe " + outputPath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    } else {
        System.out.printf("%s File이 존재하지 않습니다\n", filePath);
    }

}