package dao

import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement
import shared.SharedPaths
import java.sql.DriverManager

class ConexaoDAO {
    val connection : Connection?
    val statement : Statement?
    val resultSet : ResultSet?

    init {
        this.connection = DriverManager.getConnection(SharedPaths.STRING_DE_CONEXAO_JDBC)
        this.statement = null
        this.resultSet = null
    }

    fun executeQuery(sqlString : String) : ResultSet? {
        this.statement = this.connection?.createStatement()
        this.resultSet = this.statement?.executeQuery(sqlString)
        return this.resultSet
    }

    fun close(){
        this.connection?.close()
        this.statement?.close()
        this.resultSet?.close()
    }
}