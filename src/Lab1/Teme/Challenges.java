package Lab1.Teme;

public class Challenges {
    public Challenges() {
    }

    public void Challenge1(){
        ///the program prints the numbers from 1 to 100.
        /// for multiples of 3, the program prints "fizz", for multiples of 5, the program prints "buzz" and for multiples of both 3 and 5, the program prints "fizzbuzz"
        System.out.println("\n Stage 1:");
        int i;
        for(i=1;i<=100;i++)
            if(i%3==0&&i%5!=0)
                System.out.println("fizz");
            else if(i%5==0&&i%3!=0)
                System.out.println("buzz");
            else if(i%15==0)
                System.out.println("fizzbuzz");
            else System.out.println(i);
        System.out.println("\n Stage 2:");
        ///for multiples of 7 the program prints rizz and for multiples of 11 the program prints jazz
        for(i=1;i<=100;i++)
            if(i%3==0&&i%5!=0)
                System.out.println("fizz");
            else if(i%5==0&&i%3!=0)
                System.out.println("buzz");
            else if(i%15==0)
                System.out.println("fizzbuzz");
            else if(i%7==0)
                System.out.println("rizz");
            else if(i%11==0)
                System.out.println("jazz");
            else System.out.println(i);

    }
    String compute(int n) {
//        If the number is divisible by 3, write “Foo” instead of the number
//        If the number is divisible by 5, add “Bar”
//        If the number is divisible by 7, add “Qix”
//        For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
        String rezultat = "";
        int numarCifre = 0, nn = 0, nnn=n;
        if (n % 3 == 0)
            rezultat = rezultat.concat("Foo");
        if (n % 5 == 0)
            rezultat = rezultat.concat("Bar");
        if (n % 7 == 0)
            rezultat = rezultat.concat("Qix");
        while (n != 0) {
            nn = nn * 10 + n % 10;
            n = n / 10;
        }
        while (nn != 0) {
            if (nn % 10 == 3) {
                rezultat = rezultat.concat("Foo");
                nn = nn / 10;
            } else if (nn % 10 == 5) {
                rezultat = rezultat.concat("Bar");
                nn = nn / 10;
            } else if (nn % 10 == 7) {
                rezultat = rezultat.concat("Qix");
                nn = nn / 10;
            } else
                nn = nn / 10;
        }

        if(rezultat.equals(""))
            return ""+nnn;
        return rezultat;
    }

    String compute2(int n) {
        System.out.println("\nStage 2:");
        ///Replace 0 with *
        String rezultat;
        int nn=n;
        rezultat = compute(n);
        while(nn!=0){
            if(nn%10==0)
                rezultat+="*";
            nn=nn/10;
        }
        if(rezultat.equals(n+"*"))
        {
            rezultat="";
            while(n!=0){
                if(n%10==0)
                    rezultat+="*";
                else rezultat+=n%10;
                n=n/10;
            }
        }

        return rezultat;
    }

    public void Challenge3(int n, int a[]) {
        ///find the number of pairs of the array
        int i = 0, j, numarPerechi = 0;
        for (i = 0; i < n; i++)
            for (j = i + 1; j < n; j++)
                if (a[i] == a[j]) {
                    numarPerechi++;
                    i++;
                    j = i + 1;
                }
        System.out.println(numarPerechi);
    }

    public void Challenge4(int n, int a[]) {
        ///find the number of pairs of the array
        int i = 0, j, numarPerechi = 0, k=0;
        for (i = 0; i < n; i++)
        {
            k=0;
            for (j = i + 1; j < n; j++)
                if (a[i] == a[j])
                {
                    k++;
                    if(k==2)
                    {
                        numarPerechi++;
                        i++;
                        j = i + 1;
                    }

                }
        }
        System.out.println(numarPerechi);
    }
}


