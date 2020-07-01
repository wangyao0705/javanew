package javanew;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して3つペットオブジェクトを
作成してください。

 * @author user
 *
 */

public class Pets {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader;
		Pet pet = new Pet();
		try {
			reader = new FileReader("C:\\Users\\user\\Desktop\\pet.txt");
			String line;
			BufferedReader bufferedReader = new BufferedReader(reader);
			//			bufferedReader.readLine();
			int row = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if (row == 0) {
					row++;
				} else {

					//				System.out.println(line);
					String str = line.replace(" ", "");

					String[] vs = str.split(",");

					//						System.out.println(Arrays.toString(vs));

					pet.setName(vs[0]);
					pet.setAge(Integer.parseInt(vs[1]));
					pet.setType(Integer.parseInt(vs[2]));

					//				for (int i = 0; i < vs.length; i++) {
					if (pet.getType() == 0) {

						System.out.println("cat:" + pet.getName() + " " + pet.getAge() + " " + pet.getType());
					} else {

						System.out.println("dog:" + pet.getName() + " " + pet.getAge() + " " + pet.getType());

					}
				}
			}

			//			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		//		Pet cat = new Pet();
		//		Pet dog = new Pet();

	}

}
