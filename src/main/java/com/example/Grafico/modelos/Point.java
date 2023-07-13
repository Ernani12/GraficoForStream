package com.example.Grafico.modelos;

import com.example.Grafico.controllers.PointPostDTO;
import com.example.Grafico.controllers.PointResquetDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Entity(name="Points")  
    //not using SQL
    @Table(name="Points")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    
    public class Point {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Integer id;
        private  double x;
        private  double y;
    
        public Point(Double x, Double y) {
            this.x = x;
            this.y = y;
        }

        public Point(PointPostDTO R){
            //record  crated seters and getters too
           this.x=R.x();
           this.y=R.y();
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


        @Override
        public String toString() {
            return "Point [id=" + id + ", x=" + x + ", y=" + y + "]";
        }
    }

