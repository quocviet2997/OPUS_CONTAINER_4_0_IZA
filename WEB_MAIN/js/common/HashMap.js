    var HashMap = function()
    {
        var mapVal  = {};    // private
        var pos     = new Array();

        this.get = function( key )
        {
            return mapVal[ key ];
        }

        this.getPos = function( n )
        {
            return mapVal[ pos[n] ];
        }

        this.remove = function( n )
        {
            var ary = new Array();
            for( var i=0; i<map.size(); i++ )
            {
                if( i != n )
                {
                    ary.push( pos[i] );
                }
            }
            pos = ary;
        }

        this.toString = function()
        {
            var str = "[";
            for( var i=0; i<pos.length; i++ )
            {
                 str += pos[i] + '=' + mapVal[ pos[i] ] +', ';
            }
            return str.substring(0, str.length-2) + "]";
        }

        this.put = function( key, val )
        {
            mapVal[key] = val;

            var flg = true;
            for( var i=0; i<pos.length; i++ )
            {
                if( key == pos[i] )
                    flg = false;
            }

            if( flg )
                pos.push( key );
        }

        this.size = function()
        {
            return pos.length;
        }
    }
