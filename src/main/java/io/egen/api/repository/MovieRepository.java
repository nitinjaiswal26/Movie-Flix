package io.egen.api.repository;

import java.util.List;

import io.egen.api.entity.Movie;

public interface MovieRepository {

	public List<Movie> findAll();

	public Movie findOne(String id);

	public Movie findById(String id);

	public Movie create(Movie movie);

	public Movie update(Movie movie);

	public void delete(Movie movie);
}
