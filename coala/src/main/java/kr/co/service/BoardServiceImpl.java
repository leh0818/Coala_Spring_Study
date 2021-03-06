package kr.co.service;

import javax.inject.Inject;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.dao.BoardDAO;
import kr.co.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO dao;
	
	@Override
	public void write(BoardVO boardVO) throws Exception{
		dao.write(boardVO);
	}
	//게시물 목록 조회
	
	@Override
	public List<BoardVO> list() throws Exception{
		return dao.list();
	}
	//게시물 조회
	@Override
	public BoardVO read(int bno) throws Exception{
		return dao.read(bno);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		
	}	
	
}
