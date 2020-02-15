import React from 'react';
import '../../styles/header.css';

class Header extends React.Component{
    render(){
        return(
            <div className="myHeader">
                <h1 className="maintextheader">Twitter Informatics</h1>
            </div>
        );
    }
}

export default Header;