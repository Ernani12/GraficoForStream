package com.api.grafico.servicos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.grafico.modelos.Point;
import com.api.grafico.repositorio.PointServico;

@Service
public class PointServiceImp implements PointServico  {
    //from crudRepositiry we have all methods
@Autowired
private PointServico repo;



   public void run(String...args) throws Exception {
      		
		Point P1= new Point(6,6);
		Point P2= new Point(4,4);
		Point P3= new Point(4,4);
	

      repo.save(P1);
      repo.save(P2);
      repo.save(P3); 

       // get list of employees
       Iterable < Point > p = repo.findAll();
       p.forEach(employee -> System.out.println(employee.toString()));
   }



   @Override
   public void save(Point p) {
       repo.save(p);
   }

   @Override
   public List < Point > findAll() {
       return repo.findAll();
   }

}
