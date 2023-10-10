package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @DisplayName("1,2를 입력 받아 split 메서드를 사용한다.")
    @Test
    void splitStr() {
        // given
        String str = "1,2";
        // when
        String[] arr = str.split(",");
        // then
        assertThat(arr).hasSize(2)
                .containsExactly("1","2");
    }

    @DisplayName("(1,2) 값이 주어질 때 substring 메서드를 사용한다.")
    @Test
    void substringStr() {
        // given
        String str = "(1,2)";
        // when
        String substringStr = str.substring(1, str.length() -1);
        // then
        assertThat(substringStr).hasSize(3)
                .isEqualTo("1,2");
    }

    @DisplayName("String의 charAt 메서드를 사용할 때 위치 값을 벗어나면 익셉션이 발생한다.")
    @Test
    void test() {
        // given
        String str = "abc";
        // when // then
        assertThatThrownBy(() -> str.charAt(5))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 5");
    }


}
