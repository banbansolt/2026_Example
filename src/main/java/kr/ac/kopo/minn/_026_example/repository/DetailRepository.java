package kr.ac.kopo.minn._026_example.repository;

import kr.ac.kopo.minn._026_example.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}