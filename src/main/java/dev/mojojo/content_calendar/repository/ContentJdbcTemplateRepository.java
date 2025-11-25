package dev.mojojo.content_calendar.repository;

import dev.mojojo.content_calendar.model.Content;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ContentJdbcTemplateRepository {
    private final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    private static Content mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new Content(
//                rs.getInt( "id"),
//                rs.getString("title"),
//                rs.getString("desc"),
//                rs.getString("status"),
//                rs.getString("content_type"),
//                rs.getTimestamp("date_created"),
//                rs.getTimestamp("date_updated"),
//                rs.getString("url")
//        );
//    }
}
