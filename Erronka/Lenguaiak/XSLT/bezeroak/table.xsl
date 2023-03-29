<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    
    <xsl:import href="../orokorra.xsl"/>
    
    <xsl:template match="/">
        <xsl:apply-imports />
    </xsl:template>
    
    <xsl:template match="bezeroak">
        <table>
            <tr>
                <th>Izena</th>
                <th>Emaila</th>
            </tr>
            <xsl:for-each select="bezeroa">
                <xsl:sort select="izena" />
                <tr id="{@id}">
                    <td><xsl:value-of select="izena"/></td>
                    <td><xsl:value-of select="emaila"/></td>
                </tr>                        
            </xsl:for-each>
        </table>
        
    </xsl:template>
    
</xsl:stylesheet>