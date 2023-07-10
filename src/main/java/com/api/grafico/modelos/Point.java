package com.api.grafico.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

    @Entity
    
    public class Point {


        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Integer id;
        private  double x;
        private  double y;
    
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
    
        public double getX() {
            return x;
        }
    
        public double getY() {
            return y;
        }


         public void  setgetX(double x) {
            this.x= x;
        }
         public void  setgetY(double y) {
            this.y= y;
        }
    }

