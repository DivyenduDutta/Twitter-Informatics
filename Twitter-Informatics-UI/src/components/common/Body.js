import React from 'react';
import { Switch, Route } from 'react-router-dom';
import HomePage from '../../components/home/HomePage';
import UserDetails from '../home/UserDetailsMain';

function Body(){
    return(
        <Switch>
            <Route exact path='/' component={HomePage} />
            <Route path='/user/:userName' component={UserDetails} />
        </Switch>
    )
}

export default Body;