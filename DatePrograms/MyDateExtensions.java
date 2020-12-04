package DatePrograms;

public class MyDateExtensions {

	static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	static int getMonthIndex(String month){
        //Gets the Index of the particular month
        int month_ptr = 0;
        for(int i=0; i<12; i++){
            if(months[i].equalsIgnoreCase(month.trim()))
                month_ptr = i;
        }
        return month_ptr;
	}
	
	static String getDateSuffix(int n){
        String d = n + "";
        if (d.startsWith("0")) d = d.substring(1);
        String daysuffix = (d.endsWith("11") || d.endsWith("12") || d.endsWith("13"))
          ? "th"
          : (d.endsWith("1"))
              ? "st"
              : (d.endsWith("2"))
                  ? "nd"
                  : (d.endsWith("3"))
                      ? "rd"
                      : "th";
        return daysuffix;
	}
	
	static boolean isLeapYear(int y){
        if(y % 4 == 0){
            if(y%100 == 0)
                return false;
            if(y%400 == 0)
                return true;
            return true;
        }
        return false;
	}
	
	static int JulianSumUpto(int n){
        //Sums up all the days in a month until a given month
        int x = 31;
        for(int i=1; i<=n; i++)
            x+=daysInMonth[i];
        return x;
	}
	
	static String convertDate(String dx){
        String ret = "";
        int d, m, y;
        //28102020 (8) ; 28/10/2020 (10) ; 28th October 2020 (including spaces: 2+2(suffix)+1+(len of month)+1+4
        if(dx.length() == 8){
            // DDMMYYYY Format
            d = Integer.parseInt(dx.substring(0,2));
            m = Integer.parseInt(dx.substring(2,4));
            y = Integer.parseInt(dx.substring(4));
        }else if(dx.length() == 10){
            // DD/MM/YYYY Format
            d = Integer.parseInt(dx.substring(0,2));
            m = Integer.parseInt(dx.substring(3,5));
            y = Integer.parseInt(dx.substring(6));
        }else{
            // DD<Suffix> Month YYYY Format
            String[] dy = dx.split(" ");
            String day = dy[0].trim();
            day = (day.length() == 4) ? day : "0"+day; //Padding incase days is given in single digit
            day = day.substring(0,2);
            d = Integer.parseInt(day);
            int month_ptr = getMonthIndex(dy[1]); //Get Month Index
            m = month_ptr + 1; //Turn it into human understandable month indexes (eg. Jan = 1)
            y = Integer.parseInt(dy[2].trim());
        }
        ret = d + " " + m + " " + y;
        return ret;
	}
	
	static int getJulianDate(int d, int m, int y){
        if(isLeapYear(y)) //Handles Leap Year Case
            daysInMonth[1] = 29;
        else
            daysInMonth[1] = 28;
        int days_passed = (m == 1) ? 0 : JulianSumUpto(m -1 -1); //JulianSum
        return days_passed + d;
	}
	
	static int getDateDifference(String dx, String dy){
        int d1, m1, y1, d2, m2, y2, nd1, nd2, diff=0, year_sum=0;
        //Date Splitting
        String x[] = dx.split(" ");
        String y[] = dy.split(" ");
        //First Date Extraction
        d1 = Integer.parseInt(x[0]); m1 = Integer.parseInt(x[1]); y1 = Integer.parseInt(x[2]);
        //Second Date Extraction
        d2 = Integer.parseInt(y[0]); m2 = Integer.parseInt(y[1]); y2 = Integer.parseInt(y[2]);
        //Julian Conversion
        nd1 = getJulianDate(d1, m1, y1); //Start Julian Date
        nd2 = getJulianDate(d2, m2, y2); //End Julian Date
        //Conditional Logic
        if(y1 == y2){
           //LOGIC: Julian(E) - Julian(S)
           diff = Math.abs(nd2 - nd1);
        }else if(y1 > y2){
           //LOGIC: ([365?366] - Julian(E)) + [(y2+1).......(y1-1)] + Julian(S) Reverse Of else Case
           for(int i=(y2+1); i<y1; i++)
               year_sum += (isLeapYear(i) ? 366 : 365);
           diff = ((isLeapYear(y2) ? 366 : 365) - nd2) + year_sum + nd1;
        }else{
            //LOGIC: ([365?366] - Julian(S)) + [(y1+1).......(y2-1)] + Julian(E)
            for(int i=(y1+1); i<y2; i++)
                year_sum += (isLeapYear(i) ? 366 : 365);
            diff = ((isLeapYear(y1) ? 366 : 365) - nd1) + year_sum + nd2;
        }
        return diff;
	}

	static String[] getMonthFromJulianDate(int d){
        String[] ret = new String[2];
        int month_ptr = 0;
        for(int i=1; i<d; i++){
            if(i>=JulianSumUpto(0))
                month_ptr = 1;
            if(i>=JulianSumUpto(1))
                month_ptr = 2;
            if(i>=JulianSumUpto(2))
                month_ptr = 3;
            if(i>=JulianSumUpto(3))
                month_ptr = 4;
            if(i>=JulianSumUpto(4))
                month_ptr = 5;
            if(i>=JulianSumUpto(5))
                month_ptr = 6;
            if(i>=JulianSumUpto(6))
                month_ptr = 7;
            if(i>=JulianSumUpto(7))
                month_ptr = 8;
            if(i>=JulianSumUpto(8))
                month_ptr = 9;
            if(i>=JulianSumUpto(9))
                month_ptr = 10;
            if(i>=JulianSumUpto(10))
                month_ptr = 11;
        }
        ret[0] = month_ptr + "";
        ret[1] = months[month_ptr];
        return ret;
    }
	
	static String julianToGregorianDate(int d, int y){
        String ret = "";
        if(isLeapYear(y)){
            daysInMonth[1] = 29;
        }
        if( d > (isLeapYear(y) ? 366 : 365)){
            ret = futurejulianToGregorianDate( Math.abs((isLeapYear(y+1) ? 366 : 365) - d), (isLeapYear(y) ? 366 : 365), y);
        }else{
            String[] m = getMonthFromJulianDate(d);
            int mx = Integer.parseInt(m[0]);
            String month = m[1];
            int dx = Math.abs(d % JulianSumUpto(mx-1));
            dx = ((dx == 0) ? 31 : dx);
            ret = "" + dx + getDateSuffix(dx) + " " + month + " " + y;
        }
        return ret;
	}
	
    static String futurejulianToGregorianDate(int n, int dn, int y){
        String ret = "";
        if((dn+n) > (isLeapYear(y) ? 366 : 365))
            {
                int date_delta = n - ((isLeapYear(y) ? 366 : 365) - dn);
                ret = julianToGregorianDate(date_delta, y+1);
            } else 
                ret = julianToGregorianDate(dn + n, y);
        return ret;
    }

    static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    // static String getFirstDayOfYear(int Y){
    //     //Month starts from March, 1 = March, Jan & Feb are from Previous Year
    //     //Dec=11, Feb=12
    //     Y -= 1; //-1 as jan comes as part of previous year
    //     int C = Y/100;
    //     Y = Y%100; 
    //     int K = 1; //FirstDay
    //     int M = 11; //January
    //     int W = Math.abs((int)((K + Math.floor(2.6*M - 0.2) - 2*C + Y + Math.floor(Y/4) + Math.floor(C/4))) % 7);
    //     return days[W];
    // }
}