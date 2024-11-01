package top.soft.bookonline.dao;

import top.soft.bookonline.servlet.TypeServlet;
import top.soft.bookonline.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 图书分类的类
 */
public class TypeDao {
    /**
     * 获取所有图书类型的信息，返回数组形式
     */
    public ArrayList<TypeServlet> get_ListInfo() {
        ArrayList<TypeServlet> tagArray = new ArrayList<>();
        String sql = "SELECT * FROM booktype";
        try (Connection conn = JdbcUtil.getConn();
             PreparedStatement stm = conn.prepareStatement(sql);
             ResultSet rs = stm.executeQuery()) {

            while (rs.next()) {
                TypeServlet tag = new TypeServlet();
                tag.setTid(rs.getInt("tid"));
                tag.setName(rs.getString("name"));
                tagArray.add(tag);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception properly
        }
        return tagArray;
    }

    /**
     * 修改图书分类的信息
     */
    public void updateTypeBook(int tid, String name) {
        String sql = "UPDATE booktype SET name=? WHERE tid=?";
        try (Connection conn = JdbcUtil.getConn();
             PreparedStatement stm = conn.prepareStatement(sql)) {

            stm.setString(1, name);
            stm.setInt(2, tid);
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception properly
        }
    }

    /**
     * 添加一个图书分类
     */
    public void addBookType(String name) {
        String sql = "INSERT INTO booktype(name) VALUES(?)";
        try (Connection conn = JdbcUtil.getConn();
             PreparedStatement stm = conn.prepareStatement(sql)) {

            stm.setString(1, name);
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception properly
        }
    }

    /**
     * 删除一个图书分类
     */
    public void deleteBookType(int tid) {
        String sql = "DELETE FROM booktype WHERE tid=?";
        try (Connection conn = JdbcUtil.getConn();
             PreparedStatement stm = conn.prepareStatement(sql)) {

            stm.setInt(1, tid);
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception properly
        }
    }
}