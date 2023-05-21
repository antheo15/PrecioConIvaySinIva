package Tienda;

public class precio {
    
            public static void main(String[] args) {
                System.out.println("************************");
                System.out.println("TIENDA DE TOMATES");
                System.out.println("************************");
                System.out.println("libra de Tomate 100.0");
                double precioSinIVA = 100.0;
                double precioConIVA = calcularPrecioConIVA(precioSinIVA);
                System.out.println("Precio del tomate sin IVA: " + precioSinIVA);
                System.out.println("Precio del tomate con IVA: " + precioConIVA);
            }

            public static double calcularPrecioConIVA(double precioSinIVA) {
                double porcentajeIVA = 0.21; // 21% de IVA, puedes cambiar este valor según tus necesidades
                double precioConIVA = precioSinIVA * (1 + porcentajeIVA);
                return precioConIVA;
            }
        }
    

