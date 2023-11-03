import java.util.Scanner;

public class konversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                int pilihan;
                do {
                    System.out.println("Pilih operasi konversi yang diinginkan:");
                    System.out.println("1. Desimal ke Biner");
                    System.out.println("2. Desimal ke Heksadesimal");
                    System.out.println("3. Biner ke Desimal");
                    System.out.println("4. Biner ke Heksadesimal");
                    System.out.println("5. Heksadesimal ke Desimal");
                    System.out.println("6. Heksadesimal ke Biner");
                    System.out.println("7. Keluar");
                    System.out.print("Pilihan Anda: ");
                    pilihan = input.nextInt();

                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukkan bilangan desimal: ");
                            int desimal1 = input.nextInt();
                            String biner = desimalKeBiner(desimal1);
                            System.out.println("Hasil konversi ke biner: " + biner);
                            break;
                        case 2:
                            System.out.print("Masukkan bilangan desimal: ");
                            int desimal2 = input.nextInt();
                            String heksadesimal = desimalKeHeksadesimal(desimal2);
                            System.out.println("Hasil konversi ke heksadesimal: " + heksadesimal);
                            break;
                        case 3:
                            System.out.print("Masukkan bilangan biner: ");
                            String bin = input.next();
                            int desimalDariBiner = binerKeDesimal(bin);
                            System.out.println("Hasil konversi ke desimal: " + desimalDariBiner);
                            break;
//                            Menggunakkan method pada library java
                        case 4:
                            System.out.print("Masukkan bilangan biner: ");
                            String bilBiner = input.next();
                            int desimaldaribinerkeHeksa = Integer.parseInt(bilBiner, 2);
                            String heksDariBiner = Integer.toHexString(desimaldaribinerkeHeksa);
                            System.out.println("Hasil konversi ke heksadesimal: " + heksDariBiner);
                            break;
//                            Menggunakkan method pada library java
                        case 5:
                            System.out.print("Masukkan bilangan heksadesimal: ");
                            String nilaiHeks = input.next();
                            int desimalDariHeks = Integer.parseInt(nilaiHeks, 16);
                            System.out.println("Hasil konversi ke desimal: " + desimalDariHeks);
                            break;
//                            Mengunnakkan method pada library java
                        case 6:
                            System.out.print("Masukkan bilangan heksadesimal: ");
                            String hexNum = input.next();
                            int heksadesimalKebiner = Integer.parseInt(hexNum, 16);
                            String binerDariheksa = Integer.toBinaryString(heksadesimalKebiner);
                            System.out.println("Hasil konversi ke biner: " + binerDariheksa);
                            break;
                        case 7:
                            System.out.println("Terima kasih! Program berakhir.");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan pilih 1-7.");
                            break;
                    }
                } while (pilihan != 7);
            }
            // Konversi dari desimal ke biner
            private static String desimalKeBiner(int desimal) {
                String biner = "";
                if (desimal == 0) {
                    return "0";
                }
                while (desimal > 0) {
                    int sisa = desimal % 2;
                    biner = sisa + biner;
                    desimal = desimal / 2;
                }
                return biner;
            }
            // Konversi dari desimal ke heksadesimal
            public static String desimalKeHeksadesimal(int desimal) {
                String heksadesimal = "";
                if (desimal == 0) {
                    return "0";
                }
                while (desimal > 0) {
                    int sisaBagi = desimal % 16;
                    if (sisaBagi < 10) {
                        heksadesimal = sisaBagi + heksadesimal;
                    } else {
                        heksadesimal = (char) ('A' + sisaBagi - 10) + heksadesimal;
                    }
                    desimal = desimal / 16;
                }
                return heksadesimal;
            }

            // Konversi dari biner ke desimal
            public static int binerKeDesimal(String biner) {
                int desimal = 0;
                int pangkat = 0;
                for (int i = biner.length() - 1; i >= 0; i--) {
                    int digit = biner.charAt(i) - '0';
                    desimal += digit * Math.pow(2, pangkat);
                    pangkat++;
                }
                return desimal;
            }

        }
