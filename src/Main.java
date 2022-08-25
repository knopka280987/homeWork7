public class Main {
    public static void main(String[] args) {

        //task1
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";

            String fulName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника - " + fulName);
        }
        {
            var firstName = "Ivan";
            var middleName = "Ivanovich";
            var lastName = "Ivanov";

            var fullName = String.format("%s %s %s", firstName, middleName, lastName);
            System.out.printf("ФИО сотрудника - %s", fullName);
        }
    }
         //task2
         static {
             var firstName = "Ivan";
             var middleName = "Ivanovich";
             var lastName = "Ivanov";

             var fullName = String.format("%s %s %s", firstName, middleName, lastName);
             var result = fullName.toUpperCase();
             System.out.printf("Данные ФИО сотрудника для заполнения отчета - %s", result);

         }

         //task3
         {
             var fullName = "Иванов Семен Семенович";
             var result :String[] = fullName.toCharArray();
             for (int i = 0; i < chars.length; i++) {
                 if ()
             }
             String[] = fullName.split(regex);
             var split :String[] =fullName.split( regex)
             String result = "";
             for (String current : split) {
                 if (current.contains(ё)) {
                     var replacement :String=current.replace(target: "ё", replacement: "e");
                     result += replacement;
                 } else {
                     result += current;
                 }
                     result +="";
                 }
                 System.out.printf("Данные ФИО сотрудника - %s", result);

             }

         }


