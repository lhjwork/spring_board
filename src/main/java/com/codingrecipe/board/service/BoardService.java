package com.codingrecipe.board.service;
import com.codingrecipe.board.repository.BoardRepsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepsitory boardRepsitory;
}