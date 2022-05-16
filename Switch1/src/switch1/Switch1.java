package switch1;

public class Switch1 {

        public static void main(String[] args) {
            int meses = 2;
            
            String Mes;
            
            switch(meses){
                case 1: Mes = "Enero";
                       break;
                case 2: Mes = "Febrero";
                       break;
                case 3: Mes = "Marzo";
                       break;
                case 4: Mes = "Abril";
                       break;
                case 5: Mes = "Mayo";
                       break;
                case 6: Mes = "Junio";
                       break;
                case 7: Mes = "Julio";
                       break;
                case 8: Mes = "Agosto";
                       break;
                case 9: Mes = "Septiembre";
                       break;
                case 10: Mes = "Octubre";
                       break;
                case 11: Mes = "Noviembre";
                       break;
                case 12: Mes = "Diciembre";
                       break;       
                default: Mes = "Sin registro";       
                       break;
            } 
            System.out.println(Mes);
    }
    
}
