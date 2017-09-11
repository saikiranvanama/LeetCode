
public class FlowerBed {

	public static void main(String[] args) {
		System.out.println(canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int i = 0;

		if (i + 1 < flowerbed.length && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
			flowerbed[i++] = 1;
			System.out.println(i);
			n--;
		}
		while (n > 0 && i < flowerbed.length - 1) {
			
			if (flowerbed[i] == 1) {
				i++;
				continue;
			}
				

			if (i - 1 >= 0 && i + 1 < flowerbed.length) {
				if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
					flowerbed[i] = 1;
					n--;
				}
			}

			i++;
			System.out.println(i);
		}

		if (i == flowerbed.length - 1 && i - 1 >= 0 && n > 0) {
			if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
				flowerbed[i] = 1;
				n--;
			}
			i++;
		}

		return n <= 0;
	}

}
