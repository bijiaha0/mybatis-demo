package com.enjoylearning.mybatis.factory.real;

import com.enjoylearning.mybatis.factory.product.JiaSmallMovie;
import com.enjoylearning.mybatis.factory.product.SmallMovie;


public class JiaSmallMovieFactory implements SmallMovieFactory {

	@Override
	public SmallMovie createMovie() {
		SmallMovie smallMovie = new JiaSmallMovie("jia");
		return smallMovie;
	}

}
