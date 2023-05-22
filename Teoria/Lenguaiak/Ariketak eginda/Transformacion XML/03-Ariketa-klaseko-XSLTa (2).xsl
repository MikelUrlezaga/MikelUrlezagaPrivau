<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:param name="title" select="'Berria'"/>
    
    <xsl:template match="/">
        <html>
            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
                <title><xsl:value-of select="$title"/></title>
                <link rel="stylesheet" href="berriak.css" />
                <meta charset="utf-8"/>
            </head>
            <body>
                <header>
                    <h1><xsl:value-of select="$title"/></h1>
                </header>
                <nav>
                    <a href="#" class="key-yellow">Gizartea</a>
                    <a href="#" class="key-blue">Politika</a>
                    <a href="#" class="key-red">Ekonomia</a>
                    <a href="#" class="key-green">Kultura</a>
                    <a href="#" class="key-brown">Kirola</a>
                </nav>
                <main>
                    <div id="col-1" class="col">
                        <xsl:apply-templates select="berriak/berria[@nagusia]"/>
                    </div>
                    <div id="col-2" class="col">
                        <xsl:apply-templates select="berriak/berria[not(@nagusia)]"/>
                    </div>
                </main>
            </body>
        </html>
        
    </xsl:template>
    
    <xsl:template match="berria">
        <div class="post">
            <h2>
                <a href="{esteka}" target="_blank"><xsl:value-of select="izenburua"/></a> 
            </h2>
            <div class="info">
                <!--
                     <ul class="keywords inline-list">
                     <xsl:for-each select="kategoriak/kategoria">
                     <li class="key key-blue"><xsl:value-of select="."/></li>
                     </xsl:for-each>
                     </ul>
                -->
                <xsl:apply-templates select="kategoriak"/>
                <xsl:apply-templates select="autoreak"/>
            </div>
            <xsl:if test="irudia">
                <img src="{irudia}" alt="{izenburua}" title="{izenburua}" />    
            </xsl:if>
            <!-- 
            <p class="content">
                <xsl:value-of select="sarrera"/>
                <span class="date"><xsl:value-of select="data"/></span>
            </p>
            -->
            <xsl:apply-templates select="sarrera"/>
            <xsl:apply-templates select="erlazionatuak"/>
        </div>
    </xsl:template>
    
    <xsl:template match="kategoriak">
        <ul class="keywords inline-list">
            <xsl:for-each select="kategoria">
                <!--
                <li class="key key-blue"><xsl:value-of select="."/></li>
                -->
                <li>
                    <xsl:attribute name="class">
                    
                        <xsl:choose>
                            <xsl:when test=".='Politika'">key key-blue</xsl:when>
                            <xsl:when test=".='Gizartea'">key key-yellow</xsl:when>
                            <xsl:when test=".='Ekonomia'">key key-red</xsl:when>
                            <xsl:when test=".='Kultura'">key key-green</xsl:when>
                            <xsl:when test=".='Kirola'">key key-brown</xsl:when>
                            <xsl:otherwise>key key-default</xsl:otherwise> 
                        </xsl:choose>
                    
                    </xsl:attribute>
                    <xsl:value-of select="."/>
                </li>

            </xsl:for-each>
        </ul>
    </xsl:template>

    <xsl:template match="autoreak">
        <ul class="authors inline-list">
            <xsl:for-each select="autorea">
                <li>
                    <xsl:value-of select="izena"/>
                    <xsl:if test="twitter">
                        <!--
                        <a href="{twitter}" target="_blank"><i class="fa-twitter"></i></a>
                        -->
                        <a>
                            <xsl:attribute name="href">
                                <xsl:value-of select="twitter"/>
                            </xsl:attribute>
                            <xsl:attribute name="target">_blank</xsl:attribute>
                            <i class="fa-twitter"></i>
                        </a>
                    </xsl:if>
                
                </li>
            </xsl:for-each>
        </ul>
    </xsl:template>

    <xsl:template match="sarrera">
        <p class="content">
            <xsl:value-of select="."/>
            <span class="date"><xsl:value-of select="../data"/></span>
        </p>
    </xsl:template>

    <xsl:template match="erlazionatuak">
        <ul class="relateds">
        <xsl:for-each select="posta">
            <xsl:variable name="rel" select="@id"/>
            <li>
                <a href="{//berria[@id=$rel]/esteka}">
                    <xsl:value-of select="//berria[@id=$rel]/izenburua"/>
                </a>
            </li>
        </xsl:for-each>
        </ul>
    </xsl:template>
    
</xsl:stylesheet>