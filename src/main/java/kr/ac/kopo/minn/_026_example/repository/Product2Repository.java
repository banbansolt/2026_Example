package kr.ac.kopo.minn._026_example.repository;


import kr.ac.kopo.minn._026_example.domain.Product2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product2Repository extends JpaRepository<Product2, Integer> {
}