//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main(String[] args) {
    String filePath = ".\\data\\kbu.jpg";   // 상대주소
    String outputPath = ".\\data\\kbu_copy.jpg";
    int count = 0;

    File file = new File(filePath);
    if (file.exists()) {
        System.out.printf("%s File이 존재합니다.\n", filePath);
        try {
            FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(outputPath);
            int data;
            while ((data = inputStream.read()) != -1) {
                count++;
                outputStream.write(data);
            }
            System.out.printf("%,d Bytes Copy 완료.", count);
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    } else {
        System.out.printf("%s File이 존재하지 않습니다.", filePath);
    }
}