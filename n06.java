import java.util.Scanner;
import java.io.*;

public class n06 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String f1 = scanner.nextLine();
		
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String f2 = scanner.nextLine();
		int c;
		try {
			FileReader fr= new FileReader(f1);
			FileWriter fw= new FileWriter("appended.txt");
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			
			fr = new FileReader(f2); // 두번째 열기
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");			
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}
