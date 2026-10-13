package kr.ac.kopo.minn._026_example.repository;

import kr.ac.kopo.minn._026_example.domain.Player;
import kr.ac.kopo.minn._026_example.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}