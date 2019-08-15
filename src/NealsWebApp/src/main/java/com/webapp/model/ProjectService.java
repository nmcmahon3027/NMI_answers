package com.webapp.model;

import com.webapp.ProjectType;

import java.util.ArrayList;
import java.util.List;

public class ProjectService {
	public List getAvailableGames(ProjectType type){

		List list = new ArrayList();

		if(type.equals(ProjectType.INTERACTIVENOVEL)){
			list.add("Interactive Novel");
			System.out.println("TEXT BASED");
			list.add("Text based adventure game");
		}else if(type.equals(ProjectType.POKEMON)){
			list.add("Pokemon");
			list.add("Guessing game");
		}else if(type.equals(ProjectType.TICTACTOE)){
			list.add("Tic-Tac-Toe");
			list.add("Classic TTT");
		}else{
			list.add("No Projects Available");
		}
		return list;

	}
}
