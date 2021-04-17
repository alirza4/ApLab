import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MusicCollection jazz=new MusicCollection();
        MusicCollection pop=new MusicCollection();
        MusicCollection rock=new MusicCollection();
        MusicCollection country=new MusicCollection();
        MusicCollection Favorite=new MusicCollection();
        Scanner scanner=new Scanner(System.in);
        int n,j,a;
        String s,s1,s2,s3;
        while (true)
        {
            System.out.println("1.add file\n2.remove file\n3.check file names\n4.check specific index filename\n5.check favorite file name\n6.remove favorite file\n7.play a Music\n8.stop playing\n9.Search\n10.quit");
            while (true){
                a=scanner.nextInt();
                if (a==1 || a==2 || a==3 || a==4 || a==5 || a==6 || a==7 || a==8 ||a==9 || a==10) break;
                else System.out.println("** Error!!! plz Try again **");
            }

            if(a==1)
            {

                System.out.println("1.jazz\n2.pop\n3.rock\n4.country");
                n=scanner.nextInt();
                System.out.println("Enter File name:");
                s1=scanner.next();
                System.out.println("Enter Fileband name");
                s2=scanner.next();
                System.out.println("Enter Date of Release file ");
                s3=scanner.next();
                s="Song "+s1+"  (*** Fileband name: "+s2+" !!! Date of Release: "+s3+" ***)";
                System.out.println("Do you want this song adding to your Favorite song?!(yes=1  NO=another number)");
                int NF = scanner.nextInt();
                switch (n)
                {
                    case 1:
                        if (NF==1){
                            Favorite.addFile(s+" ->jazz");
                        }
                        jazz.addFile(s);
                        break;
                    case 2:
                        if (NF==1){
                            Favorite.addFile(s+" ->pop");
                        }
                        pop.addFile(s);
                        break;
                    case 3:
                        if (NF==1){
                            Favorite.addFile(s+" ->rock");
                        }
                        rock.addFile(s);
                        break;
                    case 4:
                        if (NF==1){
                            Favorite.addFile(s+" ->country");
                        }
                        country.addFile(s);
                }
            }
            if(a==2)
            {
                System.out.println("1.jazz\n2.pop\n3.rock\n4.country");
                n=scanner.nextInt();
                switch (n)
                {
                    case 1:
                        jazz.listAllFiles();
                        System.out.println("Enter file number:");
                        j=scanner.nextInt();

                        jazz.removeFile(j-1);
                        System.out.println("!!!Removed successfully!!!\n");
                        jazz.listAllFiles();
                        break;
                    case 2:
                        pop.listAllFiles();
                        System.out.println("!!!1Enter file number:!!!");
                        j=scanner.nextInt();
                        pop.removeFile(j-1);
                        System.out.println("!!!Removed successfully!!!\n");
                        pop.listAllFiles();
                        break;
                    case 3:
                        rock.listAllFiles();
                        System.out.println("Enter file number:");
                        j=scanner.nextInt();
                        rock.removeFile(j-1);
                        System.out.println("!!!Removed successfully!!!\n");
                        rock.listAllFiles();
                        break;
                    case 4:
                        country.listAllFiles();
                        System.out.println("Enter file number:");
                        j=scanner.nextInt();
                        country.removeFile(j-1);
                        System.out.println("!!!Removed successfully!!!\n");
                        country.listAllFiles();
                        break;
                }
            }
            if(a==3)
            {
                System.out.println("1.jazz\n2.pop\n3.rock\n4.country");
                n=scanner.nextInt();
                switch (n)
                {
                    case 1:
                        jazz.listAllFiles();
                        break;
                    case 2:
                        pop.listAllFiles();
                        break;
                    case 3:
                        rock.listAllFiles();
                        break;
                    case 4:
                        country.listAllFiles();
                        break;
                }
            }
            if(a==4)
            {
                System.out.println("1.jazz\n2.pop\n3.rock\n4.country");
                n=scanner.nextInt();
                System.out.println("Enter file number:");
                j=scanner.nextInt();
                switch (n)
                {
                    case 1:
                        jazz.listFile(j-1);
                        break;
                    case 2:
                        pop.listFile(j-1);
                        break;
                    case 3:
                        rock.listFile(j-1);
                        break;
                    case 4:
                        country.listFile(j-1);
                        break;
                }
            }
            if (a==5){
                Favorite.listAllFiles();
            }
            if (a==6){
                Favorite.listAllFiles();
                System.out.println("witch song do want to remove?!");
                j= scanner.nextInt();
                Favorite.removeFile(j-1);
                System.out.println("Removed successfully\n");


            }
            if(a==7)
            {
                System.out.println("1.jazz\n2.pop\n3.rock\n4.country");
                n=scanner.nextInt();
                System.out.println("Enter file number:");
                j=scanner.nextInt();
                switch (n)
                {
                    case 1:
                        jazz.startPlaying(j-1);
                        break;
                    case 2:
                        pop.startPlaying(j-1);
                        break;
                    case 3:
                        rock.startPlaying(j-1);
                        break;
                    case 4:
                        country.startPlaying(j-1);
                        break;
                }
            }
            if(a==8)
            {
                jazz.stopPlaying();
            }
            if (a==9){
                String stringsearch=scanner.next();
                jazz.search(stringsearch);
                pop.search(stringsearch);
                rock.search(stringsearch);
                country.search(stringsearch);
            }
            if(a==10){
                System.out.println("\n!!!App Closed!!!\n");
                return;
            }

        }
    }
}

