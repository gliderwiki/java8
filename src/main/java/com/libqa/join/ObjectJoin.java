package com.libqa.join;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author : yion
 * @Date : 2016. 8. 22.
 * @Description :
 */
public class ObjectJoin {

    static List<Game> list = Arrays.asList(
            new Game("Dragon Blaze", 5),
            new Game("Angry Bird", 5),
            new Game("Candy Crush", 5)
    );

    public static void main(String[] args) {
        String result = list.stream().map(x -> x.getName())
                .collect(Collectors.joining(",", "{", "}"));

        System.out.println("result = " + result); // {Dragon Blaze, Angry Bird, Candy Crush}

    }


    private static class Game {
        String name;
        int ranking;

        public Game(String name, int ranking) {
            this.name = name;
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }
    }
}
