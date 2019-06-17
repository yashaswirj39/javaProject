package geeksforgeeks.sudoplacements.sparraysandsearching.arrays;

/**
 * Input
 * 3
 * 5
 * 4 2 1 5 3
 * 6
 * 5 6 2 3 1 7
 * 336
 * 357 73 351 824 486 557 217 627 358 527 358 338 272 870 362 897 23 618 113 718 697 586 42 424 130 230 566 560 933 297 856 54 963 585 735 655 973 458 370 533 964 608 484 912 636 68 849 676 939 224 143 755 512 742 176 460 826 222 871 627 935 206 784 851 399 280 702 194 735 638 535 557 994 177 706 963 549 882 301 414 642 856 856 143 463 612 878 425 679 753 444 297 674 41 314 876 73 819 611 18 933 113 696 170 832 41 489 686 91 498 590 991 146 354 315 652 741 45 259 336 760 193 606 265 182 504 830 776 609 293 998 550 557 562 628 468 542 130 241 814 175 602 78 216 684 214 993 825 602 393 760 671 429 28 85 76 787 499 971 288 848 605 504 222 664 707 364 11 172 490 241 165 543 620 914 592 705 819 233 751 206 976 540 304 423 99 248 585 649 972 865 914 76 546 713 547 679 770 263 520 986 290 945 866 541 246 509 319 871 602 324 133 473 153 88 571 764 902 104 424 528 601 970 16 566 29 544 348 89 944 638 410 464 50 682 589 343 609 61 222 759 955 889 147 691 950 844 431 621 749 68 537 784 36 227 186 39 854 630 225 749 924 360 258 767 945 956 319 727 412 26 356 2 550 497 585 516 965 343 76 914 143 197 949 73 427 607 174 430 405 706 627 813 376 94 566 37 737 142 815 995 257 653 937 839 483 356 16 132 231 842 626 12 638 187 691 651 663 635 894 354 417 453 9 263 234 455 304 635 304 257 149 125 318 214 110
 */

import java.util.Scanner;

public class ImmediateSmallerElement {
    private static String immediateSmallerElement(int[] array){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]){
                sb.append(array[i+1]).append(" ");
            } else
                sb.append(-1).append(" ");
        }
        return sb.append(-1).toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int sizeOfArray = scanner.nextInt();
            int array[] = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(immediateSmallerElement(array)+"\n");
        }
    }
}
