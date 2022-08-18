import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    private Artist artist;

    @BeforeEach
    public void setUp(){
        this.artist = new Artist("Someone");
    }

    @Test
    public void canSetName() {
     //Given
     artist.setName("Random");


     //When
     String newName = artist.getName();

     //Then
     assertThat(newName).isEqualTo("Random");

    }
}
