package hackerRank.prepare.java.DataStructures;

import java.util.Scanner;

public class OneDArray_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
	}
	
//	public static boolean canWin(int leap, int[] game) {
//		// test case 1 ~ 오류 발생
//		boolean result = false;
//        for(int i = 0; i < game.length - 1; i++) {
//            if(i + leap > game.length) {
//                result = true;
//                break;
//            } else if(i + 1 == game.length || i + leap == game.length){
//                if(game[i + 1] == 0 || game[i + leap] == 0) {
//                    result = true;
//                    break;
//                }
//            } else {
//                if(game[i + 1] != 0) {
//                    if(game[i + leap] != 0) {
//                        result = false;
//                        break;
//                    } else {
//                        i += leap - 1;
//                    }
//                }                
//            }
//        }
//        return result;
//    }
	
	public static boolean canWin(int leap, int[] game) {
		return isSolvable(leap, game, 0);
	}
	
	private static boolean isSolvable(int leap, int[] game, int i) {
	    // Base Cases
	    if (i >= game.length) {
	        return true;
	    } else if (i < 0 || game[i] == 1) {
	        return false;
	    }
	            
	    game[i] = 1; // marks as visited

	    // Recursive Cases
	    return isSolvable(leap, game, i + leap) || 
	           isSolvable(leap, game, i + 1) || 
	           isSolvable(leap, game, i - 1);
	}
}
