import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedList;


@ExtendWith(MockitoExtension.class)
class ForestManagerWithDAOUnitTest {
    private Forest forest;

    @Mock
    Connection connectionMock;

    @Mock
    JdbcDAO jdbcDAOMock;

    @InjectMocks
    private ForestManagerWithDAO dao;

    @BeforeEach
    public void initTrees() {
        forest = new Forest(new LinkedList<>(Arrays.asList(new Tree(WoodSpecy.ASH), new Tree(WoodSpecy.ACACIA),
                new Tree(WoodSpecy.BAMBOO))), 100F);
    }

    @Test
    public void should_mock_find_by_code() throws SQLException, ConnectException {
        // GIVEN
        when(jdbcDAOMock.findForestByCode(Mockito.anyString())).thenReturn(forest);
        when(jdbcDAOMock.setUpConnection()).thenReturn(connectionMock);

        // WHEN
        dao.resolveForest("toto");

        // THEN
        assertThat(dao.forest).isEqualTo(forest);

    }

    @Test
    public void findForestByCode_should_throws_ConnectException() throws SQLException, ConnectException {
        // GIVEN
        when(connectionMock.isClosed()).thenReturn(true);
        when(jdbcDAOMock.setUpConnection()).thenReturn(connectionMock);

        // WHEN
        // THEN
        assertThatExceptionOfType(ConnectException.class).isThrownBy(() -> dao.resolveForest("toto"));
    }

    @Test
    public void saveForest_should_throws_ConnectException() throws IllegalStateException {
        // GIVEN
        // WHEN
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> dao.saveForest(null));
    }

    @Test
    public void saveForest_should_save() throws SQLException, ConnectException {
        // GIVEN
        when(jdbcDAOMock.setUpConnection()).thenReturn(connectionMock);
        when(jdbcDAOMock.getConnection()).thenReturn(connectionMock);

        // WHEN
        dao.saveForest("toto");

        // THEN
        verify(jdbcDAOMock, times(1)).saveForest();
        verify(connectionMock, times(1)).commit();

    }

    @Test
    public void printForest_should_return_forestToString() throws SQLException, ConnectException {
        // GIVEN
        String expected = forest.toString();
        String code = "toto";
        when(jdbcDAOMock.findForestByCode(Mockito.anyString())).thenReturn(forest);
        when(jdbcDAOMock.setUpConnection()).thenReturn(connectionMock);
        dao.resolveForest(code);

        // WHEN
        String result = dao.printForest();

        // THEN
        assertThat(result).isEqualTo(expected);

    }

}