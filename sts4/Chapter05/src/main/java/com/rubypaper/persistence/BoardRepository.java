package com.rubypaper.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.rubypaper.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
	List<Board> findByTitle(String searchkeyword);
	List<Board> findByContentContaining(String searchkeyword);
	List<Board> findByTitleContainingOrContentContaining(String title, String content);
	List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
//	List<Board> findByTitleContaining(String searchKeyword, Pageable paging);
//	Page<Board> findByTitleContaining(String searchKeyword, Pageable paging);

}
