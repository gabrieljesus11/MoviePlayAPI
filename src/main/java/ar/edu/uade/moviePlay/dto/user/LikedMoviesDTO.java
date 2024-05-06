package ar.edu.uade.moviePlay.dto.user;

import ar.edu.uade.moviePlay.dto.movie.MovieDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LikedMoviesDTO {
    private List<MovieDTO> movies;
}
