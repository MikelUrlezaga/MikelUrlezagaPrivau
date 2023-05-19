<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
    <xsl:template match="/">
        <html>
            <head>
                <title>Eskaria <xsl:value-of select="eskaria/@id"/></title>
                <link rel="stylesheet" href="css/styles.css" />
            </head>
            <body>
                <header>
                    <h1>Eskaria <xsl:value-of select="eskaria/@id"/></h1>
                    <p>
                        <b>Data: </b><xsl:value-of select="eskaria/eskaera_data"/>
                        <xsl:apply-templates select="eskaria/egoera"/>
                    </p>
                </header>
                <main>
                    <div class="flex-container">
                        <xsl:if test="eskaria/saltzailea">
                            <div class="user employee shadow">
                                <xsl:apply-templates select="eskaria/saltzailea"/>
                            </div>
                        </xsl:if>
                        <div class="user customer shadow">
                            <xsl:apply-templates select="eskaria/bezeroa"/>
                        </div>
                    </div>
                    <div>
                        <xsl:apply-templates select="eskaria/lerroak"/>
                    </div>                
                </main>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="eskaria/egoera">
        <span>
            <xsl:attribute name="class">
                <xsl:choose>
                    <xsl:when test="@id=1">bullet yellow-bullet</xsl:when>
                    <xsl:when test="@id=2">bullet red-bullet</xsl:when>
                    <xsl:when test="@id=3">bullet green-bullet</xsl:when>
                </xsl:choose>
            </xsl:attribute>
            <xsl:value-of select="."/>
        </span>    
    </xsl:template>
    
    <xsl:template match="saltzailea">
        <p class="header">Erabiltzailea</p>
        <p>
            <img src="images/{abatar}"/>
            <span><xsl:value-of select="izena"/></span>
            <span><xsl:value-of select="abizena"/></span>
            <span class="text-muted">(<xsl:value-of select="emaila"/>)</span>
        </p>
    </xsl:template>
    
    <xsl:template match="bezeroa">
        <p class="header">Bezeroa</p>
        <p>
            <img src="images/{abatar}"/>
            <span><xsl:value-of select="izena"/></span>
            <span><xsl:value-of select="abizena"/></span>
            <span class="text-muted">(<xsl:value-of select="emaila"/>)</span>
        </p>
    </xsl:template>
    
    <xsl:template match="lerroak">
        <h2>Lerroak</h2>
        <ul class="table-items">
            <li class="table-header">
                <div class="col col-name">Izena</div>
                <div class="col col-category">Kategoria</div>
                <div class="col col-price">Salneurria</div>
                <div class="col col-op"></div>
                <div class="col col-amount">Kopurua</div>
                <div class="col col-op"></div>
                <div class="col col-total">Total</div>
            </li>
            
            <xsl:for-each select="item">
                <xsl:sort select="produktua/izena"/>
                <xsl:variable name="total" select="kopurua*produktua/salneurria"/>      
                <li class="table-row shadow">
                    <div class="col col-name">
                        <img src="images/{produktua/irudia}" />
                        <xsl:value-of select="produktua/izena"/>
                        <span class="text-muted"><xsl:value-of select="produktua/deskribapena"/></span>
                    </div>
                    <div class="col col-category"><xsl:value-of select="produktua/kategoria"/></div>
                    <div class="col col-price"><xsl:value-of select="produktua/salneurria"/>€</div>
                    <div class="col col-op">x</div>
                    <div class="col col-amount"><xsl:value-of select="kopurua"/></div>
                    <div class="col col-op">=</div>
                    <div class="col col-total"><xsl:value-of select="format-number($total, '###,###.00')"/>€</div>
                </li>
            </xsl:for-each>
        </ul>
        
    </xsl:template>    
    
</xsl:stylesheet>